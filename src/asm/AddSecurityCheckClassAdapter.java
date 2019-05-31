package asm;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;


public class AddSecurityCheckClassAdapter extends ClassVisitor{

    public AddSecurityCheckClassAdapter(ClassVisitor cv){
        super(Opcodes.ASM5,cv);
    }

    public MethodVisitor visitMethod(int access,String name,String desc,String singnature,String[] exceptions){
        MethodVisitor mv = cv.visitMethod(access,name,desc,singnature,exceptions);
        MethodVisitor wrapperMv = mv;
        if (mv != null){
            if (name.equals("operation")){
                wrapperMv = new AddSecurityMethodAdapter(mv);
            }
        }
        return wrapperMv;
    }
}
