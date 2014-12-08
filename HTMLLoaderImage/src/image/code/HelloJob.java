package image.code;

import java.awt.Dimension;

import gui.ava.html.image.generator.HtmlImageGenerator;

 
 
public class HelloJob  {
 
	public static void main(String arg[]){
		System.out.println("Inside Main Method...........");
		HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
		System.out.println("Image generator...");
		imageGenerator.loadHtml("<h1 align=\"center\">Sample </h1> <br/><b>Hello World!</b> Please goto <a title=\"Goto Google\" href=\"http://www.google.com\">Google</a>.");
		System.out.println("Loaded html code");
		imageGenerator.saveAsImage("hello-world.jpeg");
		 
		System.out.println("Save to the file");
		
		imageGenerator.saveAsHtmlWithMap("hello-world.html", "hello-world.jpeg");
		imageGenerator.setSize(new Dimension(900, 900));
		imageGenerator.saveAsImage("Hello.JPEG");
	
		System.out.println("And Downloaded");
	}
}
