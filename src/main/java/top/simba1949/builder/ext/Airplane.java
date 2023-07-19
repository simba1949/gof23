package top.simba1949.builder.ext;

import lombok.ToString;

/**
 * @author anthony
 * @datetime 2023/7/19 22:00
 */
@ToString
public class Airplane {
    private String engine; // 引擎
    private String nose; // 机头
    private String fuselage; // 机身
    private String wing; // 机翼
    private String tail; // 机尾

    /**
     * 私有化构造方法
     *
     * @param builder
     */
    private Airplane(Builder builder) {
        this.engine = builder.engine;
        this.nose = builder.nose;
        this.fuselage = builder.fuselage;
        this.wing = builder.wing;
        this.tail = builder.tail;
    }

    public static final class Builder {
        private String engine; // 引擎
        private String nose; // 机头
        private String fuselage; // 机身
        private String wing; // 机翼
        private String tail; // 机尾

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder nose(String nose) {
            this.nose = nose;
            return this;
        }

        public Builder fuselage(String fuselage) {
            this.fuselage = fuselage;
            return this;
        }

        public Builder wing(String wing) {
            this.wing = wing;
            return this;
        }

        public Builder tail(String tail) {
            this.tail = tail;
            return this;
        }

        public Airplane build() {
            return new Airplane(this);
        }
    }
}