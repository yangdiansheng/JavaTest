package asm;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

public class SecurityWeaveGenerator{
    public static void main(String[] args) throws Exception{
        String className = Account.class.getName();
        ClassReader cr = new ClassReader(className);
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS);
        AddSecurityCheckClassAdapter classAdapter = new AddSecurityCheckClassAdapter(cw);
        cr.accept(classAdapter,ClassReader.SKIP_DEBUG);
        byte[] data = cw.toByteArray();
//        File file = new File("" + className.replaceAll("\\.","/") + ".class");
        File file = new File("/Users/yangdiansheng/Desktop/javacode/JavaTest/out/production/JavaTest/asm/Account.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();
    }
}
