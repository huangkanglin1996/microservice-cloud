package cn.huangkanglin.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author hkl
 * @Date 2019/4/6 0:12
 **/
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable {
    private Long deptId;
    private String deptName;
    private String dbSource;
}