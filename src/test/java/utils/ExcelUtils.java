package utils;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    private static Workbook workbook;
     
    public static void setExcelFile(String path, String SheetName) throws EncryptedDocumentException, IOException
    {
        FileInputStream fis=new FileInputStream(path);
        workbook=WorkbookFactory.create(fis);
    }
    public static String getCellData(int rowNum, int columnNum, String sheetname)
    {
        Sheet sheet=workbook.getSheet(sheetname);
        Row row=sheet.getRow(rowNum);
        Cell cell=row.getCell(columnNum);
        System.out.println(cell.toString());
        return cell.toString();
    }
    public static int getRowCount(String sheetName)
    {
        Sheet sheet=workbook.getSheet(sheetName);
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet not found: " + sheetName);
        }
        return sheet.getPhysicalNumberOfRows();
    }


    
}
