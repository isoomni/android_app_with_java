package sessionTwo;
public class Login {
    public static void main(String[] args) {
        try {
            boolean isSuccess = login("g23", "123234");
            if(isSuccess) System.out.println("성공적으로 로그인 되었습니다.");
            else System.out.println("로그인에 실패하였습니다.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Copyright g23 2015");
        }
        
    }     
    static boolean login(String id, String pw) throws Exception{
        boolean isNetworkFailed = false;
        boolean isNoId = false;
        boolean isPasswordWrong =false;
        boolean isPWExpired = false;

        if(isNetworkFailed) throw new Exception("Network Failed");
        else if (isNoId) throw new Exception("아이디가 존재하지 않습니다.");
        else if (isPasswordWrong) throw new Exception("패스워드가 틀렸습니다.");
        else if (isPWExpired) throw new Exception("패스워드가 존재하지 않습니다.");

        return true;

    }
}
