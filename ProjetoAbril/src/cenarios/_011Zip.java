/****
 * Script Name	 : <b> ScriptZIP</b>
 * Generated	 : <b>11/01/2022 07:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win7 version xx Build xxx (s)
 *  
 * @since  2022/01/11
 * @author Wellington Medeiros...
 * 
 *
 * 
 */

package cenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.testng.annotations.Test;

import ftor_testng.AbrilUtils;
import ftor_testng.ConfigureExecution;

public class _011Zip extends AbrilUtils {

	/// Caso de Teste
	@Test
	public void Zip() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("011");
	}

	// Método de Teste
	public static void main(String[] a) throws Exception {
		// Exemplo para zipar pasta
		// zipFolder("c:\\a", "c:\\a.zip");
		zipFolder("C:\\Users\\a515360\\git\\automated-tests-api\\ProjetoAbril\\saidas\\PDFReport",	"C:\\Users\\a515360\\git\\automated-tests-api\\ProjetoAbril\\saidas\\PDFReport.zip");
		zipFolder("C:\\Users\\a515360\\git\\automated-tests-api\\ProjetoAbril\\saidas\\ExtentReports","C:\\Users\\a515360\\git\\automated-tests-api\\ProjetoAbril\\saidas\\ExtentReports.zip");
	}

	static public void zipFolder(String srcFolder, String destZipFile) throws Exception {
		ZipOutputStream zip = null;
		FileOutputStream fileWriter = null;

		fileWriter = new FileOutputStream(destZipFile);
		zip = new ZipOutputStream(fileWriter);

		addFolderToZip("", srcFolder, zip);
		zip.flush();
		zip.close();
	}

	static private void addFileToZip(String path, String srcFile, ZipOutputStream zip) throws Exception {

		File folder = new File(srcFile);
		if (folder.isDirectory()) {
			addFolderToZip(path, srcFile, zip);
		} else {
			byte[] buf = new byte[1024];
			int len;
			FileInputStream in = new FileInputStream(srcFile);
			zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));
			while ((len = in.read(buf)) > 0) {
				zip.write(buf, 0, len);
			}
		}
	}

	static private void addFolderToZip(String path, String srcFolder, ZipOutputStream zip) throws Exception {
		File folder = new File(srcFolder);

		for (String fileName : folder.list()) {
			if (path.equals("")) {
				addFileToZip(folder.getName(), srcFolder + "/" + fileName, zip);
			} else {
				addFileToZip(path + "/" + folder.getName(), srcFolder + "/" + fileName, zip);
			}
		}
	}
}