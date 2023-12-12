package com.aswin.TestProj.CorePlatform;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        writeMain();
//        readMain();
        zipMain();
    }

    public static void writeMain(){
        String[] temp = {"abc", "def", "ghi"};
        try{
            writeData(temp);
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void readMain(){
//        fileRead();
        try{
//            fileNewRead();
            fileNewReadAll();
        }catch(IOException ex){
            System.out.println("IOError: " + ex.getMessage());
        }
    }

//    --------------------------------------------------------------------------------------------------
//    --------------------------------------------------------------------------------------------------

    public static void fileRead(){
        try(BufferedReader br = new BufferedReader(new FileReader("RandomText.txt"))){
//            int val;
//            while((val = br.read()) >= 0) {
//                char charVal = (char) val;
//                System.out.println(charVal);
//            }
            String inValue;
            while((inValue = br.readLine()) != null)
                System.out.println(inValue);
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void writeData(String[] data) throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))){
            for(String s : data){
                bw.write(s);
                bw.newLine();
            }
        }
    }

    public static void fileNewRead() throws IOException{
        try(BufferedReader br = Files.newBufferedReader(Paths.get("RandomText.txt"))){
            String inValue;
            while((inValue = br.readLine()) != null)
                System.out.println(inValue);
        }
    }

    public static void fileNewReadAll() throws IOException{
        List<String> lines = Files.readAllLines(Paths.get("RandomText.txt"));
        for(String s : lines)
            System.out.println(s);
    }

    public static void zipMain(){
        try(FileSystem zipFs = openZip(Paths.get("myData.zip"))){
            copyToZip(zipFs);
            writeToFileInZip(zipFs);
        }catch (Exception e){
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    private static void copyToZip(FileSystem zipFs) throws IOException {
        Path sourceFile = Paths.get("data.txt");
        Path destFile = zipFs.getPath("/dataCopy.txt");

        Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
    }

    private static void writeToFileInZip(FileSystem zipFs) throws IOException{
//        try(BufferedReader br = Files.newBufferedReader(Paths.get("data.txt"));
//        BufferedWriter bw = Files.newBufferedWriter(zipFs.getPath("/newFile.txt"))){
//            String inValue;
//            while((inValue = br.readLine()) != null){
//                bw.write(inValue);
//                bw.newLine();
//            }
//        }
        List<String> lines = Files.readAllLines(Paths.get("data.txt"));
        Files.write(zipFs.getPath("/newFile.txt"), lines, Charset.defaultCharset(), StandardOpenOption.CREATE);
    }

    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException{
        Map<String,String> providerProps = new HashMap<>();
        providerProps.put("create","true");

        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);

        return FileSystems.newFileSystem(zipUri, providerProps);
    }
}
