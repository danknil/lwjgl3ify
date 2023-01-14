package org.lwjglx.opengl;

public class ARBShaderSubroutine {
    public static java.lang.String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetActiveSubroutineName(program, shadertype, index, bufsize);
    }

    public static void glGetActiveSubroutineName(
            int program, int shadertype, int index, java.nio.IntBuffer length, java.nio.ByteBuffer name) {
        org.lwjgl.opengl.ARBShaderSubroutine.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    public static java.lang.String glGetActiveSubroutineUniformName(
            int program, int shadertype, int index, int bufsize) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetActiveSubroutineUniformName(
                program, shadertype, index, bufsize);
    }

    public static void glGetActiveSubroutineUniformName(
            int program, int shadertype, int index, java.nio.IntBuffer length, java.nio.ByteBuffer name) {
        org.lwjgl.opengl.ARBShaderSubroutine.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    public static int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
    }

    public static int glGetProgramStagei(int program, int shadertype, int pname) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetProgramStagei(program, shadertype, pname);
    }

    public static int glGetSubroutineIndex(int program, int shadertype, java.lang.CharSequence name) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetSubroutineIndex(program, shadertype, name);
    }

    public static int glGetSubroutineIndex(int program, int shadertype, java.nio.ByteBuffer name) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetSubroutineIndex(program, shadertype, name);
    }

    public static int glGetSubroutineUniformLocation(int program, int shadertype, java.lang.CharSequence name) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    public static int glGetSubroutineUniformLocation(int program, int shadertype, java.nio.ByteBuffer name) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    public static int glGetUniformSubroutineui(int shadertype, int location) {
        return org.lwjgl.opengl.ARBShaderSubroutine.glGetUniformSubroutineui(shadertype, location);
    }
}