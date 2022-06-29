package cenarios;

//public class _039Merging {
//
//}


//Merging multiple pdf documents here

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.testng.annotations.Test;

import ftor_testng.AbrilUtils;
import ftor_testng.ConfigureExecution;

import java.io.File;
import java.io.IOException;

public class _040Merging extends AbrilUtils {

	/// Caso de Teste
	@Test
	
	public void Merging() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("040");
	}

	// Método de Teste

 public static void main(String[] args)
     throws IOException
 {

     // loading all the pdf files we wish to merge

//     File file1 = new File("/Users/piyushkumar/Desktop/Merging Pdfs/file1.pdf");
//     File file2 = new File("/Users/piyushkumar/Desktop/Merging Pdfs/file2.pdf");
	 
	 //local
	 
//	 File file1 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_030APIVeja.pdf");
//	 File file2 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_031APIQR.pdf");
//	 File file3 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_032APIVejaSP.pdf");
//	 File file4 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_033APIVejaRio.pdf");
//	 File file5 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_034APIVejaSaude.pdf");
//	 File file6 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_035APISuper.pdf");
//	 File file7 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_036APIVCSA.pdf");
//	 File file8 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_037APIVCRH.pdf");
//	 File file9 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_038APIGE.pdf");
	 //File file5 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_036APIVCSA.pdf");
	 
	 //Servidor
	 
	 File file1 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_030APIVeja.pdf");
	 File file2 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_031APIQR.pdf");
	 File file3 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_032APIVejaSP.pdf");
	 File file4 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_033APIVejaRio.pdf");
	 File file5 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_034APIVejaSaude.pdf");
	 File file6 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_035APISuper.pdf");
	 File file7 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_036APIVCSA.pdf");
	 File file8 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_037APIVCRH.pdf");
	 File file9 = new File("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/_038APIGE.pdf");
	 //File file5 = new File("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_036APIVCSA.pdf");
	 
	 
	 
	 
	 
     // Instantiating PDFMergerUtility class

     PDFMergerUtility obj = new PDFMergerUtility();

     // Setting the destination file path

     //obj.setDestinationFileName("/Users/piyushkumar/Desktop/Merging Pdfs/newMerged.pdf");
     
     //local
//     obj.setDestinationFileName("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/newMerged.pdf");

     
     //servidor
     obj.setDestinationFileName("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/newMerged.pdf");
     // Add all source files, to be merged

     obj.addSource(file1);
     obj.addSource(file2);
     obj.addSource(file3);
     obj.addSource(file4);
     obj.addSource(file5);
     obj.addSource(file6);
     obj.addSource(file7);
     obj.addSource(file8);
     obj.addSource(file9);

     // Merging documents

     obj.mergeDocuments();

     System.out.println(
         "PDF Documents merged to a single file");
 }
}
