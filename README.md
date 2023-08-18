# آزمایش پنجم: Profiling
## پاسخ پرسش‌ها

## مراحل آزمایش
پس از نصب برنامه Yourkit و متصل کردن این برنامه به Intellij، مطابق شکل زیر گزینه Profile برای کلاس JavaCup فعال و انتخاب شده است:

![1](https://github.com/soleyman79/SE_Lab5/assets/59166192/cc7ef515-4313-4bd1-9338-57a1dfa0b2d5)

در قدم بعد، کلاس JavaCup مشاهده می‌شود که با موفقیت Profile شده است. تصویر زیر قسمت CPU را نمایش می‌دهد و همانطور که مشخص است، هنگام اجرای تابع ()JavaCup.main و به طور دقیق‌تر، هنگام اجرای ()JavaCup.temp، مصرف CPU یک جهش ناگهانی داشته است:

![2](https://github.com/soleyman79/SE_Lab5/assets/59166192/6a1e3e97-6065-4776-9491-b8c346d88ee2)

در ادامه، قسمت Threads به صورت call tree نمایش داده شده است. مطابق تصویر زیر، برنامه ۹۹ درصد مواقع در تابع Main و ۹۵ درصد مواقع، در تابع Temp حضور داشته است که این موضوع نشان‌دهنده پرمصرف و پرهزینه بودن این تابع است (میزان مصرف CPU توسط توابع مختلف به تفکیک در تصویر قابل مشاهده است):

![3](https://github.com/soleyman79/SE_Lab5/assets/59166192/527fef67-2d5f-494a-ab2d-e885ffba9187)

در قدم بعد، قسمت حافظه و Memory نشان داده شده است و مجددا مطابق تصویر زیر مشخص است که در انتهای اجرای برنامه و هنگام اجرای تابع Temp، مصرف حافظه به شدت افزایش داشته است. همانطور که مشخص است، بقیه توابع در مورد استفاده از حافظه مشکلی نداشته اند:

![4](https://github.com/soleyman79/SE_Lab5/assets/59166192/a1e00a0e-21b7-4ac3-ba46-002215396e03)

در ادامه، چهار موردی که پیشتر به آنها اشاره شد، در مورد کلاس Main هم مشخص شده اند و موارد مربوط به مصرف CPU و حافظه در این کلاس، در ادامه بیان خواهند شد. در ۲ تصویر زیر، مشابه مرحله اول، گزینه پروفایل کردن برای کلاس Main فعال شده است و همانطور که مشخص است، موفقیت‌آمیز بوده است:

![5](https://github.com/soleyman79/SE_Lab5/assets/59166192/ce172743-1d28-4465-93eb-d97904f273d4)

![6](https://github.com/soleyman79/SE_Lab5/assets/59166192/78f7f1b2-c6ba-47e6-b578-4e31f68d3f88)


