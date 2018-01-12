import java.awt.Color;  
import java.io.BufferedOutputStream;  
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import com.lowagie.text.DocumentException;  
import com.lowagie.text.Element;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.BaseFont;  
import com.lowagie.text.pdf.PdfContentByte;  
import com.lowagie.text.pdf.PdfGState;  
import com.lowagie.text.pdf.PdfReader;  
import com.lowagie.text.pdf.PdfStamper;  
/**
 * 生成pdf水印  
 * @author liyb
 *
 */
public class WatermarkTest {  
    public static void main(String[] args) throws DocumentException,  
            IOException {  
        // 要输出的pdf文件   
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("D:/中文2.pdf")));    //指定输出位置名称
        Calendar cal = Calendar.getInstance();  
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        // 将pdf文件先加水印然后输出  
        setWatermark(bos, "D:/中文1.pdf");     //输入文件位置名称
    }  
  
    public static void setWatermark(BufferedOutputStream bos, String input) throws DocumentException,  
            IOException {  
          
        PdfReader reader = new PdfReader(input);  
        PdfStamper stamper = new PdfStamper(reader, bos);  
        int total = reader.getNumberOfPages() + 1;  
        PdfContentByte content;  
        BaseFont base = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.EMBEDDED);  
        PdfGState gs = new PdfGState();  
        for (int i = 1; i < total; i++) {  
            //content = stamper.getOverContent(i);// 在内容上方加水印  
            content = stamper.getUnderContent(i);//在内容下方加水印  
            gs.setFillOpacity(0.2f);  
            // content.setGState(gs);  
            content.beginText();  
            //content.setGrayFill(20);   //设置透明度
            content.setColorFill(Color.LIGHT_GRAY);  
            content.setFontAndSize(base, 50);  
            content.setTextMatrix(70, 200);  
            content.showTextAligned(Element.ALIGN_CENTER, "公司内部文件，请注意保密！", 300,350, 55);  
            //设置图片
            Image image = Image.getInstance("D:/C.png");     //贴入图片
            /*img.setAlignment(Image.LEFT | Image.TEXTWRAP); 
            img.setBorder(Image.BOX); 
            img.setBorderWidth(10); 
            img.setBorderColor(BaseColor.WHITE); 
            img.scaleToFit(1000, 72);//大小 
            img.setRotationDegrees(-30);//旋转 */  
            image.setAbsolutePosition(10, 770); //设置图片位置    左右/上下
            image.scaleToFit(60,60);       //设置图片大小
            content.addImage(image); 
            content.endText();  
        }  
        stamper.close();  
    }  
}  