class Sequence {
   static int count;
   static Sequence obj=null;
   private Sequence() {
         count=0;
         
      }
      
      static synchronized Sequence getInstance()
      
      
      
      
   {
            if (obj == null)  {
               obj = new Sequence();
               System.out.println("Object created");
             }
             }86
             count++;
             System.out.println("count is"+count);
             return obj;
             }
             
          }
          
          
          
      
      public class DemoSingle {
         public static void main(String[] args) {
               Sequence s1=Sequence.getInstance();
               Sequence s2=Sequence.getInstance();
               Sequence s3=Sequence.getInstance();
               Sequence s4=Sequence.getInstance();
                          }
           
           
     }