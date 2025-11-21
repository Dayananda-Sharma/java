package com.xworkz.socialmedia.external;

import com.xworkz.socialmedia.internal.SocialMedia;

public class SocialMediaRunner {
    public static void main(String[] args) {
        SocialMedia socialMedia=new SocialMedia();
        socialMedia.displaySocialMedia(10);
      //  System.out.println(socialMedia);
        socialMedia.displayPhoneNumber(99999999);
        socialMedia.displayMail("email.com");
        socialMedia.displayOtp(4);
        socialMedia.displayUserName("daya");
    }
}
