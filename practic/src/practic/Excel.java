package practic;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

public class Excel {

	public static void main(String[] args) throws Exception
	{
		// connect to .xls
		File f=new File("Book1.xls");
		//open .xls for reading
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		int nouc=rsh.getColumns();
		//open same .xls file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
        for(int i=1;i<nour;i++)
        {
        	int x=Integer.parseInt(rsh.getCell(0, i).getContents());
        	int y=Integer.parseInt(rsh.getCell(1, i).getContents());
        	int z=x+y;
        	Number n=new Number(2,i,z);
        	wsh.addCell(n);
        }
        	wwb.write();
        	wwb.close();
        	rwb.close();
        
	}

}
