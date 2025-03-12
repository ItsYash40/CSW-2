
	class CustomNullPointerException extends Exception {
		String s;
		public CustomNullPointerException(String s) {
			this.s=s;
		}
		public String getMessage() {
			return s;
			
		}
		
	}
	public class Ass3Q2 {

		public static void main(String[] args) throws CustomNullPointerException {
			String str=null;
			String str2="";
			try {
				if(str==null) {
					throw new CustomNullPointerException("Cannot invoke , String is null");
				}
				
			}
			catch(CustomNullPointerException e) {
				System.out.println("Custom Null Pointer Exception :"+e.getMessage());
			}
			try {
				if(str2.length()==0) {
					throw new CustomNullPointerException("String is Empty");
				}
			}
			catch(CustomNullPointerException e) {
				System.out.println("Custom Null Pointer Exception :"+e.getMessage());
			}
			

		}

	}



