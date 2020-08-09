package es.jlarriba.jrmapi;

import es.jlarriba.jrmapi.model.Document;

import java.io.File;
import java.util.List;

public class Scratch {
    public static void main(String[] args) {
        Jrmapi jrmapi = new Jrmapi();

//        jrmapi.createDir("NYT","");

//        jrmapi.listDocs();

        //! CREATE FILE
//        String WORKDIR = System.getProperty("user.dir");
//        File fileToUpload = new File(WORKDIR + "/sample.pdf");
//        jrmapi.uploadDoc(fileToUpload, "8027b6ac-261e-48b6-b66c-a5e8f59bd559");

        // ! DELETING
//        Document docToDelete = new Document();
//        docToDelete.setID("f7bb4143-c531-4a3e-af86-2890a931c0ce");
//        docToDelete.setVersion(1);
//        jrmapi.deleteEntry(docToDelete);

    }
}
