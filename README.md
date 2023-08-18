# آزمایش پنجم: Profiling
## پاسخ پرسش‌ها

## مراحل آزمایش
### قسمت اول
پس از نصب برنامه Yourkit و متصل کردن این برنامه به Intellij، مطابق شکل زیر گزینه Profile برای کلاس JavaCup فعال و انتخاب شده است:

![1](https://github.com/soleyman79/SE_Lab5/assets/59166192/cc7ef515-4313-4bd1-9338-57a1dfa0b2d5)

در قدم بعد، کلاس JavaCup مشاهده می‌شود که با موفقیت Profile شده است. تصویر زیر قسمت CPU را نمایش می‌دهد و همانطور که مشخص است، هنگام اجرای تابع ()JavaCup.main و به طور دقیق‌تر، هنگام اجرای ()JavaCup.temp، مصرف CPU یک جهش ناگهانی داشته است:

![2](https://github.com/soleyman79/SE_Lab5/assets/59166192/6a1e3e97-6065-4776-9491-b8c346d88ee2)

در ادامه، قسمت Threads به صورت call tree نمایش داده شده است. مطابق تصویر زیر، برنامه 99 درصد مواقع در تابع Main و 95 درصد مواقع، در تابع Temp حضور داشته است که این موضوع نشان‌دهنده پرمصرف و پرهزینه بودن این تابع است (میزان مصرف CPU توسط توابع مختلف به تفکیک در تصویر قابل مشاهده است):

![3](https://github.com/soleyman79/SE_Lab5/assets/59166192/527fef67-2d5f-494a-ab2d-e885ffba9187)

در قدم بعد، قسمت حافظه و Memory نشان داده شده است و مجددا مطابق تصویر زیر مشخص است که در انتهای اجرای برنامه و هنگام اجرای تابع Temp، مصرف حافظه به شدت افزایش داشته است. همانطور که مشخص است، بقیه توابع در مورد استفاده از حافظه مشکلی نداشته اند:

![4](https://github.com/soleyman79/SE_Lab5/assets/59166192/a1e00a0e-21b7-4ac3-ba46-002215396e03)

در ادامه، چهار موردی که پیشتر به آنها اشاره شد، در مورد کلاس Main هم مشخص شده اند و موارد مربوط به مصرف CPU و حافظه در این کلاس، در ادامه بیان خواهند شد. در 2 تصویر زیر، مشابه مرحله اول، گزینه پروفایل کردن برای کلاس Main فعال شده است و همانطور که مشخص است، موفقیت‌آمیز بوده است:

![5](https://github.com/soleyman79/SE_Lab5/assets/59166192/ce172743-1d28-4465-93eb-d97904f273d4)

![6](https://github.com/soleyman79/SE_Lab5/assets/59166192/78f7f1b2-c6ba-47e6-b578-4e31f68d3f88)

همانطور در تصویر بالا برای مصرف CPU و در تصویر زیر برای Threadها مشخص است، تمامی موارد درباره‌ی این کلاس عادی و بدون مشکل هستند. مصرف CPU در جایی از اجرای برنامه اوج نگرفته است و همچنین بیشینه مصرف CPU توسط یک تابع در Threadها، 75 درصد است که مطابق آنچه در کلاس گفته شد، عددی منطقی است. در قسمت‌هایی که مصرف CPU نوسان اندکی داشته است، به علت ورودی گرفتن بوده است و باز در این نوسان‌ها در حدی زیاد نیستند که قابل بررسی باشند:

![7](https://github.com/soleyman79/SE_Lab5/assets/59166192/e0b77842-fc64-43b0-bafe-adac25fb85c4)

در ادامه مصرف حافظه نیز برای این کلاس مشخص است و همانطور که مشخص است، مورد غیرعادی وجود ندارد:

![8](https://github.com/soleyman79/SE_Lab5/assets/59166192/77b2483a-c71d-4a9f-b2bd-63e1302617c4)

### قسمت دوم
در این قسمت، تلاش شده است که کد تابع Temp طوری تغییر داده شود که مشکلات performance حل شوند. همانطور که در تصویر زیر مشخص است، کد بدنه تابع Temp بدون تغییر عملکرد خارجی آن، بهبود یافته است. عملا در ابتدا، یک آرایه به طول ثابت و مورد نیاز ساخته شده است و یک بار iterate انجام می‌شود. به وسیله متغیر کمکی group و عملیات باقی‌مانده گرفتن، همان کارایی قبلی حفظ شده است:

<img width="630" alt="Screenshot 1402-05-27 at 21 16 49" src="https://github.com/soleyman79/SE_Lab5/assets/59166192/62c6e74f-efbc-4ced-af39-3da04a413e2f">

تصویر بدنه نهایی این تابع، به صورت زیر است:

![9](https://github.com/soleyman79/SE_Lab5/assets/59166192/e58a1cc7-c81c-416a-bb7c-4d627fd70c17)

در ادامه، همانطور که در تصویر زیر مشاهده می‌شود، دیگر استفاده از CPU در این تابع جهش نداشته است و همه اعداد، عادی هستند:

![10](https://github.com/soleyman79/SE_Lab5/assets/59166192/89445bb5-680c-4c3d-a357-8989d6238649)

مطابق تصویر زیر، Threadها هم مشکلی ندارند و این بار تابع Temp به جای 95 درصد، 72 درصد مواقع CPU را در اختیار داشته است:

![11](https://github.com/soleyman79/SE_Lab5/assets/59166192/95ace8a6-daba-4efa-84a9-0c2e9b48a2fc)

و در نهایت، مصرف حافظه نیز مطابق شکل زیر عادی است و مشکلی ندارد:

![12](https://github.com/soleyman79/SE_Lab5/assets/59166192/8e9c505b-1b4c-40a4-9a70-712fbc2213cf)

### قسمت سوم
در این قسمت، روی کد دلخواه اننخابی خود، profiling اعمال شده است. کارایی این کد به این صورت است که کاربر یک عدد را به عنوان ورودی انتخاب می‌کند و خروجی شامل تمام فاکتوریل‌های از عدد ۱ تا عدد انتخابی کاربر است (یعنی خروجی شامل فاکتوریل عدد 1، فاکتوریل عدد 2 و به همین صورت تا فاکتوریل عدد n است). نسخه ابتدایی پیاده‌سازی این کد به صورت زیر است که در آن، از هر دفعه از ابتدا فاکتوریل عدد 1 تا n محاسبه می‌شود:

![13](https://github.com/soleyman79/SE_Lab5/assets/59166192/bb89b9d8-48bf-497a-a106-f5ce35af73d8)

پس از اعمال profiling بر این کد، مشاهده می‌شود که مصرف CPU جهش خواهد داشت و مطابق تصاویر زیر، در 94 درصد مواقع، CPU در اختیار Thread حاوی تابع محاسبه فاکتوریل بوده است:

![14](https://github.com/soleyman79/SE_Lab5/assets/59166192/133c15cd-7780-4eac-92eb-1bf5565a77b8)

![15](https://github.com/soleyman79/SE_Lab5/assets/59166192/b6ae21bd-cc03-44af-b9b1-4049b92f52aa)






