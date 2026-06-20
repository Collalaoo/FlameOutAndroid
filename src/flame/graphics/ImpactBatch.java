package flame.graphics;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.graphics.gl.*;
import arc.math.*;

public class ImpactBatch extends SpriteBatch{
    public float u, v, u2, v2;
    public float rx, ry;
    public float lastRotation;
    public boolean heavyShader = false;
    public boolean useColor = false;
    public boolean canChangeShader = true;
    boolean white = false;
    float[] svt = new float[1024 * SPRITE_SIZE];

    public static ImpactBatch batch;
    static Batch lastBatch;

    public static void init(){
        batch = new ImpactBatch();
    }
    public static void beginSwap(){
        lastBatch = Core.batch;
        Mat proj = Draw.proj(), trans = Draw.trans();
        //Draw.flush();
        Core.batch = batch;
        Draw.proj(proj);
        Draw.trans(trans);
    }
    public static void endSwap(){
        Draw.flush();
        Core.batch = lastBatch;
    }

    public void setWhite(boolean w){
        //if(white != w) flush();
        white = w;
    }

    public Texture getTexture(){
        return lastTexture;
    }

    @Override
    protected void draw(Texture texture, float[] spriteVertices, int offset, int count){
        float color = Color.whiteFloatBits;
        float mixColor = white ? Color.whiteFloatBits : Color.blackFloatBits;

        for(int i = 0; i < Math.min(count, svt.length); i += VERTEX_SIZE){
            svt[i] = spriteVertices[i];
            svt[i + 1] = spriteVertices[i + 1];
            svt[i + 2] = color;
            svt[i + 3] = spriteVertices[i + 3];
            svt[i + 4] = spriteVertices[i + 4];
            svt[i + 5] = mixColor;
        }
        drawSuper(texture, svt, offset, Math.min(count, svt.length));

        u = v = 0f;
        u2 = v2 = 1f;
        lastRotation = 0f;
    }

    @Override
    protected void draw(TextureRegion region, float x, float y, float originX, float originY, float width, float height, float rotation){
        setPackedColor(useColor ? getPackedColor() : Color.whiteFloatBits);
        setPackedMixColor(white ? Color.whiteFloatBits : Color.blackFloatBits);
        super.draw(region, x, y, originX, originY, width, height, rotation);
        u = region.u;
        v = region.v;
        u2 = region.u2;
        v2 = region.v2;
        lastRotation = rotation;
    }

    @Override
    protected void setShader(Shader shader, boolean apply){
        if(!canChangeShader) return;
        super.setShader(shader, apply);
    }
}
