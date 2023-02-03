package BookMyShow.BookMyShow.Dto;

import lombok.Data;

@Data
public class UserRequestDto {
    private String name;
    private int mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
