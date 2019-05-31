package asm;

import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import static jdk.internal.org.objectweb.asm.Opcodes.ASM5;

public class AddSecurityMethodAdapter extends MethodVisitor{
    public AddSecurityMethodAdapter(MethodVisitor mv) {
        super(ASM5,mv);
    }

    public void visitCode(){
        Label continueLabel = new Label();
        visitMethodInsn(Opcodes.INVOKESTATIC,
                "asm/SecurityChecker",
                "checkSecurity",
                "()V",
                false);
//        visitJumpInsn(Opcodes.IFNE,continueLabel);
//        visitInsn(Opcodes.RETURN);
        visitLabel(continueLabel);

        super.visitCode();
    }
}
