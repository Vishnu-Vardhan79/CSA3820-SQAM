package chennai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class yahoo {

	public static void main(String[] args) {
		System.out.println("hai");
		System.setProperty("webdriver.chrome.driver","C:\\manik\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		// TODO Auto-generated method stub

	}

}





package chennai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;


public class sellinium1 {

	public static void main(String[] args) {
		
		
		System.out.println("hai");
		System.setProperty("webdriver.chrome.driver","C:\\manik\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://arms.sse.saveetha.com");
		WebElement username=driver.findElement(By.id("txtusername"));
		
		System.out.println(username);
	
		WebElement password=driver.findElement(By.id("txtpassword"));
		System.out.println(password);
		WebElement login=driver.findElement(By.name("btnlogin"));
		
		System.out.println(login);
		username.sendKeys("192011090");
		
		
		password.sendKeys("Gowtham@200315");
		login.click();

	}
}





import static org.junit.Assert.assertEquals;
import java.util.Scanner; 
public class saveethaTest 
{ 
	public static void main(String[] args)
{
	String str; 
	char ch; 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : "); 
	str=sc.nextLine();
	System.out.println("Reverse of a String '"+str+"' is :"); 
	for(int j=str.length();j>0;--j)
	{
		System.out.print(str.charAt(j-1));
	assertEquals("mani",str);
			
		
		} 
	
	assertEquals("mani",str);
		
}
}


import static org.junit.Assert.assertEquals;
import java.util.Scanner;
public class third {
public static void main(String [] args)
{ 
	Scanner in=new Scanner(System.in); 
		System.out.println("enter the user name"); 
	String str1=in.nextLine(); 
	System.out.println("Reenter the user name");
	String str2=in.nextLine(); 
	assertEquals(str1,str2);
		}
}



import static org.junit.Assert.assertTrue;

import java.util.Scanner;
 class four
{ 
public static void main(String[] args) 
{ 
int age,shrt;
Scanner scan = new Scanner(System.in);
System.out.println(" Please enter your age");
age = scan.nextInt(); 
if(age>=18) 
{ 
System.out.println("Welcome to voting system Yo can Vote");
} 
else
{
	shrt= (18 - age);
System.out.println("Sorry,You can vote after :"+ shrt + " years");
assertTrue(age==shrt);

} } }


import static org.junit.Assert.assertTrue;
import java.util.Scanner;
class intrest 
{
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		float P=sc.nextFloat(); 
		float R=sc.nextFloat(); 
		float T=sc.nextFloat(); 
		float SI = (P * T * R) / 100; 
		System.out.println("Simple interest = " + SI);
		assertTrue(3600==SI);
		}
	}








import java.util.Scanner;
import static org.junit.Assert.assertTrue;
public class palindrome
{
	public static void main(String args[]) 
	{ 
		Scanner in = new Scanner(System.in);
		int r, sum = 0, temp; int n = in.nextInt();
		temp = n; 
		while (n > 0) 
		{
			r = n % 10; n = n / 10;
			sum = (sum * 10)+r;
		}
		System.out.println(sum);
		assertTrue(787==sum);
		if(temp==sum)
			System.out.println(sum+" is palindrome number");
		else
			System.out.println(sum+" is not palindrome number");
		} 

	
	}






