public class SigninInputException implements InputException{
    @Override
    public Exception getException(int input) {
        if(input <1 || input>2){
            return new Exception("Lua chon ko hop le");
        };
        return null;
    }
}
