package Day9;

public class Demo14 {
    public static void main(String[] args) {
        
        // 1
        try{

        }catch (Exception e){

        }

        // 2
        try{

        }catch (ArithmeticException e){

        }catch (Exception e){

        }

        // 3  this is compile time error
//        try{
//
//        }catch (ArithmeticException e){
//
//        }catch (ArithmeticException e){
//
//        }

        // 4
        try{

        }
        catch (Exception e){

        }
        finally {

        }

        // 5
        try{

        }catch (Exception e){

        }
        try{

        }
        catch (Exception e){

        }

        // 6
        try {

        }
        finally {

        }

        // 7   compile time error either you have to catch or finally
//        try{
//
//        }

        // 8  compile time error cannot be use without try
//        catch(Exception e){
//
//        }

        //9 finally cannot be use without try
//        finally{
//
//        }

        // 10 CE try-> catch-> finally
//        try{
//
//        }
//        finally {
//
//        }
//        catch (Exception e){
//
//        }

        // 11 CE
//        try{
//
//        }
//        try{
//
//        }
//        catch (Exception e){
//
//        } finally {
//
//        }

        //12  CE bcoz exception class will handle all exception and second catch block unreacable
//        try{
//
//        }
//        catch (Exception e){
//
//        }
//        catch (ArithmeticException e){
//
//        }
//        finally {
//
//        }

        // 13 CE
//        try{
//
//        }
//        catch (Exception e){
//
//        }
//        finally {
//
//        }
//        finally{
//
//        }


        // 14 CE
//        try{
//
//        }
//        try{
//
//        }
//        catch (Exception e){
//
//        }
//        finally {
//
//        }
//        finally{
//
//        }

        // 15 CE
//        try{
//
//        }
//        catch (Exception e1){
//
//        }
//        catch (Exception e2){
//
//        }

        //16 CE
//        try{
//
//        }
//        System.out.println("hello");
//        catch (Exception e){
//
//        }

        // 17 CE
//        try{
//
//        }
//        catch (Exception e){
//
//        }
//        System.out.println("hello");
//        finally {
//
//        }

        // 18
        try{
            try{

            }
            catch (Exception e){

            }
        }
        catch (Exception e){

        }

        // 19
        try{
            try{

            }
            catch (Exception e){

            }
            finally {

            }
        }
        catch (Exception e){

        }
        finally {

        }





    }

}
