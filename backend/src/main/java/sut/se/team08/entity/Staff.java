package sut.se.team08.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.*;
import java.util.*;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor

public class Staff {
    @Id
    @SequenceGenerator(name = "staff_seq", sequenceName = "staff_seq")
    @GeneratedValue(generator = "staff_seq", strategy = GenerationType.SEQUENCE)
    private @NonNull Long staffId;
    private @NonNull String staffName;
    private @NonNull String dayWork;
    private @NonNull String workTime;
    private @NonNull String labStaffId;
    private @NonNull String tel;

}