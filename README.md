# java-modules

Java 9 thêm tính năng modules, đây là tính năng cần thiết cho 2 mục đích chính của dự án như: 
- Khi import code của package cha thì các gói con sẽ bị import cùng theo.
- Khi ứng dụng được viết theo mô hình micro service thì các service được chia nhỏ và chạy như một ứng dụng độc lập, khi đó các Object được tạo ra từ một service sẽ không tái sử dụng được trong service khác, vì thế phải tạo thêm các Object giống nhau cho các service.

Do đó cần phải có modules để tận dụng được các Object từ các service mà không cần phải viết lại và các package khi được import sẽ không bị dư thừa.


## This is a very simple application demoing java 9 modules

To compile the application simply run the bash script `run.sh`. It will create the necessary directories
and compile in the correct order all the modules.

To run the application use the follwing command:
    `java --module-path mods/app.jar --module vn.p.app`