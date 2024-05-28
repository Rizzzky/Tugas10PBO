class MyException extends Exception1 {
   private String Teks;

   MyException(String s) {
       Teks = "Exception generated by: " + s;
       System.out.println(Teks);
   }
}

class Eksepsi {
   static void tampil(String s) throws Exception1 {
       System.out.println("Tampil");
       if (s.equals("amir")) {
           throw new MyException(s);
       }
   }

   public static void main(String[] args) {
       try {
           tampil("ali");
           tampil("amir");
           System.out.println("OK!");
       } catch (MyException ex) {
           System.out.println("Tangkap: " + ex.getMessage());
       } catch (Exception1 e) {
           System.out.println("Pengecualian umum: " + e.getMessage());
       }
   }
}