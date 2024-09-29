package SignUp;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.lang.model.element.Name;

@Getter
@Setter
@Table (name="SIGN UP")
@Entity
public class SignUpInfo {

    private String email;
    private String userName;
    private String studentName;
    private String phone;
    private String rollNo;
    private String password;
    private String institue;
    private String branch;
}
