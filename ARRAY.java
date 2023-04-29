Mehmet Techproed
  7:31 PM
//Loops (Donguler)
//loop'lar tekrar eden kodlama islerini kolaylastirmak icin kullanilir
//1-for - loop
//2-while-loop
//3- do-while loop
//4- for-each loop

//1- for - loop
/*--------for loop kalibi
for (DataType VariableName = BaslangicDegeri ; LoopCalismaKurali; Artirma/Eksiltme  ){
    //Calisacak kodlar
}
*/

//ornek 1: Console'a 5 defa 'Hi!' yazdirin
//1.yol:
System.debug('Hi');
System.debug('Hi');
System.debug('Hi');
System.debug('Hi');
System.debug('Hi');

//2.yol;
// i++  ====> i = i +1 ile aynı islevi gorur
/*													i = i+1    i= i-1
		100                 500							i++     i--
for(Baslangıc Degeri    ; Loop Calisma kurali     ;  Artırma / Eksiltme    ){
    //calisacak kodlar
}*/


for(Integer i = 1 ;  i<6;  i++  ){ 
    System.debug('Hi');    
}

//Ornek 2 : 20 (dahil) den 3 (dahil) e kadar tum integer'lari console'a yazdiriniz.

for(Integer i =20; i>2 ; i-- ){     
    System.debug(i);   
}

//Ornek 3 : 3'den (dahil) 20'ye (dahil) kadar tum cift sayilari console'a yazdiriniz. 

for(Integer i=3; i<21 ; 						i++ ){

    if(Math.mod(i,2)==0){
        System.debug(i);
    }
 
}

// Ornek 4 : 40 (dahil) dan 3 (dahil) e kadar tum tek sayilari console'a yazdiriniz.

for(Integer i=40; i>2 ; i--){
    
    if(Math.mod(i,2)!=0){
        System.debug(i);
    }   
}

// Ornek 5 : 1 den 9 a kadar sayilari ekrana yazidirirken, degiskenin degeri 6 oldugunda donguyu kiran kodu yaziniz
//(1 ve 9 dahil)

for( Integer i=1 ; i<10 ;          i++ ){
    System.debug(i);

    if(i==6){
        Break;   
    } 
}

//Ornek 6 : 6'dan 10'a kadar tum Integer'larin toplamini console'a yazdiriniz.(6 ve 10 dahil)
//Onemli: Bu tarz sorularda ilk hamleniz, memory'de toplami depolayabileceğiz bir alan olusturmaktir.

Integer toplam = 0;//toplama islemi yaptigim icin etkisiz elemani (0) koydum

for (Integer i=6; i<11; i++){
   toplam = toplam + i;
}
System.debug(toplam);
white_check_mark
eyes
raised_hands







Mehmet Techproed
  8:39 PM
Untitled
 
//Loops (Donguler)
//loop'lar tekrar eden kodlama islerini kolaylastirmak icin kullanilir
//1-for - loop
//2-while-loop
//3- do-while loop
Click to expand inline (161 lines)


Mehmet Techproed
  7:32 PM
//ornek 8: Size verilen bir String'in, index'i tek sayi olan karakterlerini console'a yazdiriniz

//String s = 'Amasya'; ==> msa

//nerden baslayacagim, nerde duracagim?

for(Integer i=0; i<= length()-1 ;){ // i= 0 1 2 3 4 5
    
}

for(Integer i=0; i< length() ;){ // i= 0 1 2 3 4 5
    
}
//------------------------------------
String s = 'Amasya';
String sonuc = '';

for(Integer i=0; i<s.length();				 i++){

    if(Math.mod(i, 2)!=0){
       sonuc = sonuc + s.substring(i, i+1);
    }
}
System.debug(sonuc); //msa

//Ornek 9 : Verilen bir String'i tersten yazdiran kodu yaziniz
// String s = 'Ali Can'; ===> naC ilA

String s = 'Ali';
String ters = '';

for(Integer i=s.length()-1;i>=0;					i--){
 
    ters = ters + s.substring(i,i+1);   
}
System.debug(ters);

//Ornek 10: Asagidaki sekli for loop kullanarak ciziniz
/*
	AAAAA
	AAAAA
	AAAAA
*/

Integer satir = 3;
Integer sutun = 5;

for(Integer i=1;i<=satir;					i++){
    String s = '';
    for(Integer j=1; j<=sutun;		j++){
   
      s = s + 'A';
     
    }
    System.debug(s);  
}


//---------icerdeki loop ==>AAAAA yazdirir----------
Integer sutun = 5;
    String s = '';

    for(Integer j=1; j<=sutun;	j++){

    	  s = s + 'A';
    }
    System.debug(s);  
//--------------------------------------------
//2. While loop
//------------------------------------------
//for loop'a cok benzer. Syntax(yazim) farklidir. Okunurlugu daha iyidir.
//While loop kosulu true veya false degerine gore degerlendirilir
//While loop condition saglanana kadar calismaya devam eder

//kalibini olusturalim
//---------------------------
//for
for(baslangic degeri;loop calisma kurali; artirma/eksiltme){
    //calisacak kodlar
}
//----------------------------

//while

baslangic degeri
    
    while(loop calisma kurali){
        
        //calisacak kodlar
        
        artirma/eksiltme
    }
//----------------------------------------

// Ornek 1: Console'a 5 defa 'Hi!' yazdirin 

Integer i =1;
while(i<6){
    
    System.debug('Hi!');
   i++; 
}


Mehmet Techproed
  8:37 PM
Untitled
 
//ornek 8: Size verilen bir String'in, index'i tek sayi olan karakterlerini console'a yazdiriniz
//String s = 'Amasya'; ==> msa
Click to expand inline (130 lines)


Mehmet Techproed
  5:56 PM
//ornek 4: Verilen bir Integer'in rakamlari toplamini console'a yazdiriniz.
//	573 ==> 5 + 7 + 3 = output 15

//Bir Integer'i Math.mod kullanarak 10'a bolersek, 'kalani' en sagdaki basamak olur
// Iki integer'i biribirine bolersek sonuc integer olur(tamsayi) mesela ( 57/10=5.7 ===> 5)
//Apex virgulden sonrasini siler, yuvarlama yapmaz


Integer i = -573;
Integer toplam = 0;
i = Math.abs(i);
//Negatif Integerlar icin de calismali. Absolute value Mutlak deger alir
//Yani her halukarda pozitif deger dondurur.

while(i>0){
    toplam = toplam + Math.mod(i, 10);
    i = i/10;
}
System.debug(toplam);


Mehmet Techproed
  6:31 PM
//ornek 4: Verilen bir Integer'in rakamlari toplamini console'a yazdiriniz.
//	573 ==> 5 + 7 + 3 = output 15

//Bir Integer'i Math.mod kullanarak 10'a bolersek, 'kalani' en sagdaki basamak olur
// Iki integer'i biribirine bolersek sonuc integer olur(tamsayi) mesela ( 57/10=5.7 ===> 5)
//Apex virgulden sonrasini siler, yuvarlama yapmaz


Integer i = -573;
Integer toplam = 0;
i = Math.abs(i);
//Negatif Integerlar icin de calismali. Absolute value Mutlak deger alir
//Yani her halukarda pozitif deger dondurur.

while(i>0){
    toplam = toplam + Math.mod(i, 10);
    i = i/10;
}
System.debug(toplam);

//Ornek 5 :  Bir string'deki tekrarsiz karakterleri console'a yazdiriniz.
   012345678910		
// kertenkelle ==> rtn

// indexOf('k')			 ==> 0  farkli, tekrarli
// lastIndexOf('k')  	 ==> 6  farkli, tekrarli 
       
// indexOf('r')			 ==> 2  ayni, tekrarsiz
// lastIndexOf('r')  	 ==> 2  ayni, tekrarsiz       
       
// 1 Yol;
   
String s = 'kertenkelle';
String sonuc = '';
Integer i =0;

                        while(i<s.length()){
                            
                            String harf = s.substring(i,i+1);

                            if(s.indexOf(harf)==s.lastIndexOf(harf)){
                                
                                sonuc = sonuc + harf;
    
                            }
                            
                            i++;    
                        }
                        System.debug(sonuc);
6:32
//ornek 4: Verilen bir Integer'in rakamlari toplamini console'a yazdiriniz.
//	573 ==> 5 + 7 + 3 = output 15

//Bir Integer'i Math.mod kullanarak 10'a bolersek, 'kalani' en sagdaki basamak olur
// Iki integer'i biribirine bolersek sonuc integer olur(tamsayi) mesela ( 57/10=5.7 ===> 5)
//Apex virgulden sonrasini siler, yuvarlama yapmaz


Integer i = -573;
Integer toplam = 0;
i = Math.abs(i);
//Negatif Integerlar icin de calismali. Absolute value Mutlak deger alir
//Yani her halukarda pozitif deger dondurur.

while(i>0){
    toplam = toplam + Math.mod(i, 10);
    i = i/10;
}
System.debug(toplam);

//Ornek 5 :  Bir string'deki tekrarsiz karakterleri console'a yazdiriniz.
   012345678910		
// kertenkelle ==> rtn

// indexOf('k')			 ==> 0  farkli, tekrarli
// lastIndexOf('k')  	 ==> 6  farkli, tekrarli 
       
// indexOf('r')			 ==> 2  ayni, tekrarsiz
// lastIndexOf('r')  	 ==> 2  ayni, tekrarsiz       
       
// 1 Yol;
   
String s = 'kertenkelle';
String sonuc = '';
Integer i =0;

                        while(i<s.length()){
                            
                            String harf = s.substring(i,i+1);

                            if(s.indexOf(harf)==s.lastIndexOf(harf)){
                                
                                sonuc = sonuc + harf;
    
                            }
                            
                            i++;    
                        }
                        System.debug(sonuc);


Mehmet Techproed
  7:39 PM
//ornek 4: Verilen bir Integer'in rakamlari toplamini console'a yazdiriniz.
//	573 ==> 5 + 7 + 3 = output 15

//Bir Integer'i Math.mod kullanarak 10'a bolersek, 'kalani' en sagdaki basamak olur
// Iki integer'i biribirine bolersek sonuc integer olur(tamsayi) mesela ( 57/10=5.7 ===> 5)
//Apex virgulden sonrasini siler, yuvarlama yapmaz


Integer i = -573;
Integer toplam = 0;
i = Math.abs(i);
//Negatif Integerlar icin de calismali. Absolute value Mutlak deger alir
//Yani her halukarda pozitif deger dondurur.

while(i>0){
    toplam = toplam + Math.mod(i, 10);
    i = i/10;
}
System.debug(toplam);

//Ornek 5 :  Bir string'deki tekrarsiz karakterleri console'a yazdiriniz.
   012345678910		
// kertenkelle ==> rtn

// indexOf('k')			 ==> 0  farkli, tekrarli
// lastIndexOf('k')  	 ==> 6  farkli, tekrarli 
       
// indexOf('r')			 ==> 2  ayni, tekrarsiz
// lastIndexOf('r')  	 ==> 2  ayni, tekrarsiz       
       
// 1 Yol;

String s = 'kertenkelle';
String sonuc = '';
Integer i =0;
                        while(i<s.length()){
                            
                            String harf = s.substring(i,i+1);

                            if(s.indexOf(harf)==s.lastIndexOf(harf)){
                                
                                sonuc = sonuc + harf;
    
                            }
                            
                            i++;    
                        }
                        System.debug(sonuc);

//2. Yol countMatches() method'u bir karakterin bir String'de kac kere kullanildigini verir
//tekrarsiz karakterler 1 kere kullanilmis olur


String s ='kertenkelle';
Integer i = 0;

while(i<s.length()){
    String harf = s.substring(i,i+1); 
    
    if(s.countMatches(harf)==1){
        System.debug(harf);
    }
    
  i++;    
}
//-------------------------------------------
//3. do - while loop
//-------------------------------------------
//kalibi olusturalim
//while

Baslangic degeri
    while(Loop calisma kurali){
        //calisacak kodlar
        artirma/azaltma
    }
//-----------------------------------------

// do while

Baslangic degeri
    
    do{
        //calisacak kodlar
         artirma/azaltma
    }while(Loop calisma kurali);

//---------------------------------------
//Ornek 1 : Console'a 5 kere 'Hi' yazdiriniz

Integer i = 1;

do{
    System.debug('Hi');
    i++;
}while(i<6);

//Ornek 2 : 5(dahil) den 3(dahil) e kadar Integer'lari console'a yazdiriniz.

            Integer i =5;
         
            do{              
               System.debug(i);
                
                i--;
          
            }while(i>2);

//------------------------------------------------------------------------------------------
// while loop ile do while loop arasindaki fark nedir?
// while loop da kodun basta kirilmasi mumkundur cunku once kural kontrol edilir

Integer i = 1;

while(i<1){
    System.debug('Ben while loop um');
    i++;
}


// do while loop da loop'un basta kirilmasi mumkun degildir. Once 1 kere calistirilir.

Integer k = 1;

do{
    
    System.debug('Ben do while loop um');
    
   k++;
    
}while(k<1);


Mehmet Techproed
  7:54 PM
//ornek 4: Verilen bir Integer'in rakamlari toplamini console'a yazdiriniz.
//	573 ==> 5 + 7 + 3 = output 15

//Bir Integer'i Math.mod kullanarak 10'a bolersek, 'kalani' en sagdaki basamak olur
// Iki integer'i biribirine bolersek sonuc integer olur(tamsayi) mesela ( 57/10=5.7 ===> 5)
//Apex virgulden sonrasini siler, yuvarlama yapmaz


Integer i = -573;
Integer toplam = 0;
i = Math.abs(i);
//Negatif Integerlar icin de calismali. Absolute value Mutlak deger alir
//Yani her halukarda pozitif deger dondurur.

while(i>0){
    toplam = toplam + Math.mod(i, 10);
    i = i/10;
}
System.debug(toplam);

//Ornek 5 :  Bir string'deki tekrarsiz karakterleri console'a yazdiriniz.
   012345678910		
// kertenkelle ==> rtn

// indexOf('k')			 ==> 0  farkli, tekrarli
// lastIndexOf('k')  	 ==> 6  farkli, tekrarli 
       
// indexOf('r')			 ==> 2  ayni, tekrarsiz
// lastIndexOf('r')  	 ==> 2  ayni, tekrarsiz       
       
// 1 Yol;

String s = 'kertenkelle';
String sonuc = '';
Integer i =0;
                        while(i<s.length()){
                            
                            String harf = s.substring(i,i+1);

                            if(s.indexOf(harf)==s.lastIndexOf(harf)){
                                
                                sonuc = sonuc + harf;
    
                            }
                            
                            i++;    
                        }
                        System.debug(sonuc);

//2. Yol countMatches() method'u bir karakterin bir String'de kac kere kullanildigini verir
//tekrarsiz karakterler 1 kere kullanilmis olur


String s ='kertenkelle';
Integer i = 0;

while(i<s.length()){
    String harf = s.substring(i,i+1); 
    
    if(s.countMatches(harf)==1){
        System.debug(harf);
    }
    
  i++;    
}
//-------------------------------------------
//3. do - while loop
//-------------------------------------------
//kalibi olusturalim
//while

Baslangic degeri
    while(Loop calisma kurali){
        //calisacak kodlar
        artirma/azaltma
    }
//-----------------------------------------

// do while

Baslangic degeri
    
    do{
        //calisacak kodlar
         artirma/azaltma
    }while(Loop calisma kurali);

//---------------------------------------
//Ornek 1 : Console'a 5 kere 'Hi' yazdiriniz

Integer i = 1;

do{
    System.debug('Hi');
    i++;
}while(i<6);

//Ornek 2 : 5(dahil) den 3(dahil) e kadar Integer'lari console'a yazdiriniz.

            Integer i =5;
         
            do{              
               System.debug(i);
                
                i--;
          
            }while(i>2);

//------------------------------------------------------------------------------------------
// while loop ile do while loop arasindaki fark nedir?
// while loop da kodun basta kirilmasi mumkundur cunku once kural kontrol edilir

Integer i = 1;

while(i<1){
    System.debug('Ben while loop um');
    i++;
}


// do while loop da loop'un basta kirilmasi mumkun degildir. Once 1 kere calistirilir.

Integer k = 1;

do{
    
    System.debug('Ben do while loop um');
    
   k++;
    
}while(k<1);

//-------------------Array--------------

//1) Coklu data saklamaya izin veren yapilardir. (Mesela bir siniftaki ogrencilerin isimleri)
//2) Array'ler tek data tipi depolayabilirler
//3) Array olusturmak icin i) Data tipi ii) Data sayisi soylenmelidir
//4) Array'ler diger collection'lardan (List, Set, Map) daha hizlidir.
//5) Array'ler diger collection'lardan daha az memory kullanirlar
//6) Array'ler icinde primitive data tipleri (Integer, String), sObjectler(Account, Contact) konabilir
//7) Degisme ihtimali olmayan datalarda kullanilir


// Array kalibini olusturalim


Mehmet Techproed
  8:33 PM
Untitled
 
//---------------------------------
// ornek 5: Bir String'deki tekrarsiz karakterleri console'a yazdiriniz.
// kertenkelle ==> rtn
Click to expand inline (188 lines)


Mehmet Techproed
  8:02 PM
//Ornek 1 : Integer data tipinde arr isminde bir array olusturunuz.Icine sirasiyla 5,9,6,10, ve3
//datalarini koyunuz. Sonrada 3. ve 5. elemanlarini toplayip sonucu console'a yazdiriniz
//3. eleman 6 ==> index'i 2 yani arr[2]
//5. eleman 3 ==> index'i 4 yani arr[4]
						  //  0 1 2	3  4    (==>indexler)
Integer[] arr = new Integer[]{5,9,6,10,3};  				
Integer toplam = arr[2] + arr[4];
System.debug(toplam);//9
System.debug( arr[2] + arr[4]);//9

//Ornek 2 : Stirng data tipinde arr isminde bir array olusturunuz. 
//Icine sirasiyla Ali, Mary,Tom, Brad datalarini koyunuz.
//Index'i 2 olan haric digerlerini ayri satirda console'a yazdiriniz.
//size() method'u arrayin eleman sayisini verir. Bu örnek icin 4 verir.
// continue keywordu (anahtar sozcuk) bir dongudeki gecerli iteration'i sonlandirip sizi
// artirma/azaltma bolumune goturur


String [] arr = new String[]{'Ali','Mary','Tom','Brad'};
 //TAVSIYE EDILMEZ 
    				// 0     1     2     3	
System.debug(arr);//(Ali, Mary, Tom, Brad)
System.debug(arr[0] ); 
System.debug(arr[1] ); 
System.debug(arr[2] ); 
System.debug(arr[3] ); 

//Tavsiye edilen			  0      1      2      3
String [] arr = new String[]{'Ali','Mary','Tom','Brad'};     

    for(Integer i = 0;  i<arr.size()     ;i++){    
        if(i==2){         
            System.debug('i=2 oldugundan continue calisacak');
            continue;
        } 
        System.debug(arr[i]);     
    }


Mehmet Techproed
  8:28 PM
Untitled
 
//Ornek 1 : Integer data tipinde arr isminde bir array olusturunuz.Icine sirasiyla 5,9,6,10, ve3
//datalarini koyunuz. Sonrada 3. ve 5. elemanlarini toplayip sonucu console'a yazdiriniz
//3. eleman 6 ==> index'i 2 yani arr[2]
//5. eleman 3 ==> index'i 4 yani arr[4]
                          //  0 1 2 3  4    (==>indexler)
Click to expand inline (62 lines)


Mehmet Techproed
  6:17 PM
//Ornek 4: (5,0,2,0) array'inde tum sifirlari sona yerlestiriniz
//(5,0,2,0)  ==>(5,2,0,0)
//Interiview sorusu olabilir.
//arr deki indexleri dolasmak icin loop kullanacagim

Integer [] arr = new Integer []{5,0,2,0};
//System.debug(arr);
Integer [] yeniArr = new Integer[arr.size()];
//System.debug(yeniArr);  //(null, null, null, null)

Integer ilkIndex = 0;
Integer sonIndex = arr.size()-1;

for(Integer i=0; i< arr.size(); 					i++ ){
    
    if(arr[i]!=0){
        
		yeniArr[ilkIndex] = arr[i]; 
        ilkIndex ++;        
    }else{
        
        yeniArr[sonIndex] = 0;
        sonIndex--;        
    }    
}
System.debug(yeniArr);//(5, 2, 0, 0)