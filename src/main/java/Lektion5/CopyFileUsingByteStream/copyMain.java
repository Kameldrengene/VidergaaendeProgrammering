package Lektion5.CopyFileUsingByteStream;

public class copyMain {


    public static void main(String[] args) {
        String source = "/home/volkan/IdeaProjects/VidergaaendeProgrammering/src/main/java/Lektion5/CopyFileUsingByteStream/file.txt";
        String destination = "/home/volkan/IdeaProjects/VidergaaendeProgrammering/src/main/java/Lektion5/CopyFileUsingByteStream/newfile.txt";
        try{
            FileHandler.copy(source,destination);
        }catch (Exception e){
            System.out.println("Filen er ikke fundet");
        }

    }
}
