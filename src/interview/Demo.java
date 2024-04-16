package interview;

public class Demo 
{
	public static void main(String[] args) {
		String s="my name is srinivas";
		String[] temp = s.split(" ");
		for(int i=temp.length-1;i>=0;i--) {
			System.out.print(temp[i]+" ");
		}
		
	}	
	
}

//WebDriverWait wait=new WebDriverWait(driver);
//wait.until(ExpectedConditions.elementVisibileId)
