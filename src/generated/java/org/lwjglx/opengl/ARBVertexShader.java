package org.lwjglx.opengl;

public class ARBVertexShader {
    public static void glBindAttribLocationARB(int programObj, int index, java.lang.CharSequence name) {
        org.lwjgl.opengl.ARBVertexShader.glBindAttribLocationARB(programObj, index, name);
    }

    public static void glBindAttribLocationARB(int programObj, int index, java.nio.ByteBuffer name) {
        org.lwjgl.opengl.ARBVertexShader.glBindAttribLocationARB(programObj, index, name);
    }

    public static void glDisableVertexAttribArrayARB(int index) {
        org.lwjgl.opengl.ARBVertexShader.glDisableVertexAttribArrayARB(index);
    }

    public static void glEnableVertexAttribArrayARB(int index) {
        org.lwjgl.opengl.ARBVertexShader.glEnableVertexAttribArrayARB(index);
    }

    public static void glGetActiveAttribARB(
            int programObj,
            int index,
            java.nio.IntBuffer length,
            java.nio.IntBuffer size,
            java.nio.IntBuffer type,
            java.nio.ByteBuffer name) {
        org.lwjgl.opengl.ARBVertexShader.glGetActiveAttribARB(programObj, index, length, size, type, name);
    }

    public static int glGetAttribLocationARB(int programObj, java.lang.CharSequence name) {
        return org.lwjgl.opengl.ARBVertexShader.glGetAttribLocationARB(programObj, name);
    }

    public static int glGetAttribLocationARB(int programObj, java.nio.ByteBuffer name) {
        return org.lwjgl.opengl.ARBVertexShader.glGetAttribLocationARB(programObj, name);
    }

    public static void glGetVertexAttribARB(int index, int pname, java.nio.DoubleBuffer params) {
        org.lwjgl.opengl.ARBVertexShader.glGetVertexAttribdvARB(index, pname, params);
    }

    public static void glGetVertexAttribARB(int index, int pname, java.nio.FloatBuffer params) {
        org.lwjgl.opengl.ARBVertexShader.glGetVertexAttribfvARB(index, pname, params);
    }

    public static void glGetVertexAttribARB(int index, int pname, java.nio.IntBuffer params) {
        org.lwjgl.opengl.ARBVertexShader.glGetVertexAttribivARB(index, pname, params);
    }

    public static void glVertexAttrib1dARB(int index, double v0) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib1dARB(index, v0);
    }

    public static void glVertexAttrib1fARB(int index, float v0) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib1fARB(index, v0);
    }

    public static void glVertexAttrib1sARB(int index, short v0) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib1sARB(index, v0);
    }

    public static void glVertexAttrib2dARB(int index, double v0, double v1) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib2dARB(index, v0, v1);
    }

    public static void glVertexAttrib2fARB(int index, float v0, float v1) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib2fARB(index, v0, v1);
    }

    public static void glVertexAttrib2sARB(int index, short v0, short v1) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib2sARB(index, v0, v1);
    }

    public static void glVertexAttrib3dARB(int index, double v0, double v1, double v2) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib3dARB(index, v0, v1, v2);
    }

    public static void glVertexAttrib3fARB(int index, float v0, float v1, float v2) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib3fARB(index, v0, v1, v2);
    }

    public static void glVertexAttrib3sARB(int index, short v0, short v1, short v2) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib3sARB(index, v0, v1, v2);
    }

    public static void glVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib4NubARB(index, x, y, z, w);
    }

    public static void glVertexAttrib4dARB(int index, double v0, double v1, double v2, double v3) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib4dARB(index, v0, v1, v2, v3);
    }

    public static void glVertexAttrib4fARB(int index, float v0, float v1, float v2, float v3) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib4fARB(index, v0, v1, v2, v3);
    }

    public static void glVertexAttrib4sARB(int index, short v0, short v1, short v2, short v3) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttrib4sARB(index, v0, v1, v2, v3);
    }

    public static void glVertexAttribPointerARB(
            int index, int size, int type, boolean normalized, int stride, long buffer_buffer_offset) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(
                index, size, type, normalized, stride, buffer_buffer_offset);
    }

    public static void glVertexAttribPointerARB(
            int index, int size, int type, boolean normalized, int stride, java.nio.ByteBuffer buffer) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, buffer);
    }

    public static void glVertexAttribPointerARB(
            int index, int size, boolean normalized, int stride, java.nio.DoubleBuffer buffer) {

        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(
                index,
                size,
                org.lwjgl.opengl.GL11.GL_DOUBLE,
                normalized,
                stride,
                me.eigenraven.lwjgl3ify.BufferCasts.toByteBuffer(buffer));
    }

    public static void glVertexAttribPointerARB(
            int index, int size, boolean normalized, int stride, java.nio.FloatBuffer buffer) {

        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(
                index, size, org.lwjgl.opengl.GL11.GL_FLOAT, normalized, stride, buffer);
    }

    public static void glVertexAttribPointerARB(
            int index, int size, boolean unsigned, boolean normalized, int stride, java.nio.ByteBuffer buffer) {

        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(
                index,
                size,
                (unsigned ? org.lwjgl.opengl.GL11.GL_UNSIGNED_BYTE : org.lwjgl.opengl.GL11.GL_BYTE),
                normalized,
                stride,
                org.lwjglx.MemoryUtil.getAddress(buffer));
    }

    public static void glVertexAttribPointerARB(
            int index, int size, boolean unsigned, boolean normalized, int stride, java.nio.IntBuffer buffer) {

        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(
                index,
                size,
                (unsigned ? org.lwjgl.opengl.GL11.GL_UNSIGNED_INT : org.lwjgl.opengl.GL11.GL_INT),
                normalized,
                stride,
                org.lwjglx.MemoryUtil.getAddress(buffer));
    }

    public static void glVertexAttribPointerARB(
            int index, int size, boolean unsigned, boolean normalized, int stride, java.nio.ShortBuffer buffer) {

        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(
                index,
                size,
                (unsigned ? org.lwjgl.opengl.GL11.GL_UNSIGNED_SHORT : org.lwjgl.opengl.GL11.GL_SHORT),
                normalized,
                stride,
                org.lwjglx.MemoryUtil.getAddress(buffer));
    }
}