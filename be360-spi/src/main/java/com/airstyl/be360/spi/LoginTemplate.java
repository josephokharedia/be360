package com.airstyl.be360.spi;

/*
 * Copyright (c) 2017, Airstyl and/or its affiliates. All rights reserved.
 * AIRSTYL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Created by Joseph Okharedia on 2017-07-17.
 */

public class LoginTemplate extends UITemplate {

    private UIInput username;
    private UIInput password;

    public UIInput getPassword() {
        return password;
    }

    public UIInput getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "LoginTemplate{" +
                "username=" + username +
                ", password=" + password +
                '}';
    }

    public static class BUILDER extends UITemplate.BUILDER<LoginTemplate>{

        private LoginTemplate loginTemplate;

        public BUILDER(){
            this.loginTemplate = new LoginTemplate();
        }

        public BUILDER setUsername(UIInput username){
            this.loginTemplate.username = username;
            return this;
        }

        public BUILDER setPassword(UIInput password){
            this.loginTemplate.password = password;
            return this;
        }

        @Override
        public LoginTemplate build() {
            LoginTemplate built = this.loginTemplate;
            this.loginTemplate = new LoginTemplate();
            return built;
        }
    }

}
