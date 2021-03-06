package com.xs.micro.up.domain.pojo.dto;

/**
 * @author wangqp
 * @desc bean
 * @date 2020年07月14日11:42:07
 */
public class Politician {
    private String  name;

    private boolean honest;

    public Politician() {

    }

    public Politician(String name,
                      boolean honest) {
        super();
        this.name = name;
        this.honest = honest;
    }

    public boolean isHonest() {
        return honest;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }

    public String getName() {
        return name;
    }
}
