package com.rnl.prc.dp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProcesDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException, NoSuchFieldException, IllegalAccessException {


     //   ProcessBuilder builder = new ProcessBuilder("notepad.exe");
       callOtherClass();
       //callSomeOtherFunction();

        System.out.println("after call of crash method");


    }

    public static void callOtherClass() throws ClassNotFoundException, InterruptedException, IOException {
        // Process process = builder.start();

        String javaHome = System.getProperty("java.home");
        System.out.println("java home "+javaHome);

        Class clazz =  Class.forName("com.rnl.prc.dp.ProcessExecDemo");

        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String className = clazz.getName();

        System.out.println("ClassName "+className+" javaBin "+
                javaBin);

        List<String> command = new ArrayList<>();
        command.add(javaBin);
        // command.addAll(jvmArgs);
        command.add("-cp");
        command.add(classpath);
        command.add(className);
        // command.addAll(args);

        ProcessBuilder builder1 = new ProcessBuilder(command);
        Process process1 = builder1.inheritIO().start();
        process1.waitFor();
        System.out.println("process exit value is "+process1.exitValue());
    }

    public static void callSomeOtherFunction() throws NoSuchFieldException, IllegalAccessException {

        ProcessExecDemo.doSomething();
        System.out.println("called some other method");
    }


}
