package src.com.qrcode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;

/**
 * java开发微信二维码扫一扫生成器
 * @author lovline
 * @version v.0
 *
 */
public class QrcodeAchieve {

	
	public static void main(String[] args){
		
		getQrcodeImgByContents("give me five...","d:/test.png");
		
	}
	
	/**
	 * 根据内容生成二维码图片
	 * @param contents 内容
	 * @param imgPath  生成图片存储的服务器地址
	 * 
	 */
	public static void getQrcodeImgByContents(String contents, String imgPath){
		
		int width = 140;
		int height = 140;
		
		try{
			//实例化Qrcode
			Qrcode qrCode = new Qrcode();
			//设置二维码的排错率
			//可选项 L(7%)，M(15%)，Q(25%),H(30%)
			qrCode.setQrcodeErrorCorrect('M');
			qrCode.setQrcodeEncodeMode('B');
			
			//设置二维码的尺寸取值范围[1-40]
			qrCode.setQrcodeVersion(7);
			//设置图片的尺寸
			BufferedImage bufImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
			
			//绘制二维码图片
			Graphics2D gs = bufImg.createGraphics();
			//设置二维码矩形区域的背景颜色
			gs.setBackground(Color.WHITE);
			//创建图片的矩形区域
			gs.clearRect(0, 0, width, height);
			//设置二维码的颜色
			gs.setColor(Color.green);
			
			//获取我们的内容，通过数组装起来，设置字符编码格式
			byte[] contentBytes = contents.getBytes("gb2312");
			
			//设置一个偏移量（如果不设置可能导致解析错误）
			int pixoff = 2;
			
			//输出我们的二维码 字符官方小于120个字
			if(contentBytes.length > 0 && contentBytes.length < 120){
				boolean[][] codeOut = qrCode.calQrcode(contentBytes);
				for(int i=0;i<codeOut.length;i++){
					for(int j=0;j<codeOut.length;j++){
						if(codeOut[j][i]){
							gs.fillRect(j*3+pixoff, i*3+pixoff, 3 , 3);
						}
					}
				}
				
				
			}else{
				System.out.println("too long...");
			}
			
			gs.dispose();
			bufImg.flush();
			
			//生成二维码图片
			File imgFile = new File(imgPath);
			ImageIO.write(bufImg, "png", imgFile);
			System.out.println("生成二维码图片成功了。");
			
			
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		
		
	}
	
}
