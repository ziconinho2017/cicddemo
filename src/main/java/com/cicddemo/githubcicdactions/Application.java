package com.cicddemo.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to CI CD Demo";
    }
//    echo "# cicddemo" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/ziconinho2017/cicddemo.git
//    git push -u origin main
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
