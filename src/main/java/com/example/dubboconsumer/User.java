package com.example.dubboconsumer;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: TODO
 * @Author: tiantianlikeU。
 * @Date: 2023/3/12 21:44
 */
@Data
public class User implements Serializable {
    private String id;
    private String name;
    private int age;
    private Date time;
}
