package com.xworkz.socialmedia.internal;

import com.xworkz.socialmedia.events.*;

public class SocialMedia {
    public int displaySocialMedia(int Number) {
        if (Number > 100) {
            try {
                throw new NoOfAppsException();

            } catch (NoOfAppsException NoOfAppsException) {
                NoOfAppsException.printStackTrace();
                System.out.println("this condition is true ");
            }

        } else {
            System.out.println("this condition is false");
        }
        return Number;

}
    public long displayPhoneNumber(long num) {
        if (num > 10) {
            try {
                throw new PhoneNumber();
            } catch (PhoneNumber phoneNumber) {
                phoneNumber.printStackTrace();
                System.out.println("this is correct 10 digit PhoneNumber");
            }
        } else {
            System.out.println(" this incorrect phone number");
        }
        return num;
    }
    public String displayMail(String message){
        if (message=="email.com"){
            try {
                throw new EmailCheckException();

            }catch (EmailCheckException emailCheckException){
                emailCheckException.printStackTrace();
                System.out.println("this correct mail");
            }
        }else {
            System.out.println("this is incorrect mail");
        }
        return message;
    }
    public int displayOtp(int otp){
        if (otp <6){
            try {
                throw new OneTimePasswordException();

            }catch (OneTimePasswordException oneTimePasswordException){
                oneTimePasswordException.printStackTrace();
                System.out.println("this is Correct Otp");
            }

        }else {
            System.out.println("OTP is invalid");
        }
        return otp;
    }
    public String displayUserName(String name){
        if (name =="daya"){
            try {
                throw new UserNameException();
            }catch (UserNameException userNameException){
                userNameException.printStackTrace();
                System.out.println("user name is Valid");
            }

        }else {
            System.out.println("user is invalid ");
        }
        return name;
    }

    }

