import java.io.Serial;
import java.security.PublicKey;

public class DomainException extends RuntimeException {
        @Serial
        private static final long serialVersionUID = 1L;

        public DomainException(String msg){
            super(msg);
        }



}
