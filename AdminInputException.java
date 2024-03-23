public class AdminInputException implements InputException{

    @Override
    public Exception getException(int input) {
        if(input <1 || input>5){
            return new Exception("Lua chon ko hop le");
        };
        return null;
    };
}
