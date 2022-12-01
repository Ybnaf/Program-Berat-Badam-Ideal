import java.util.Scanner



    fun main(){

        val scanner = Scanner(System.`in`)

        println("Selamat Datang di Program Penentuan Berat Badan Ideal")
        print("Input Nama : ")
        val nama = scanner.nextLine()
        print("Input Umur: ")
        val umur = scanner.nextInt()
        println("L = Laki-Laki || P = Perempuan")
        print("Input Jenis Kelamin : ")
        val jk = scanner.next()
        print("Input Berat Badan : ")
        val bb = scanner.nextDouble()
        print("Input Tinggi Badan : ")
        val tb = scanner.nextDouble()



        if(jk == "L"){
            var bemi = bb/tb*100
            println("BMI = $bemi")
            var bmi = (tb+0.0-100.0)-(0.1*(tb+0.0-100.0))

            var berat :String?
           if(bemi<18.5){
                berat = "Kurus"
           }else if(bemi>18.5 && bemi<24.9){
                berat= "Normal"
           }else if(bemi>25.9 && bemi<29){
                berat = "Overweight"
           }else{
               berat = "Obesitas"
           }
            println("$nama dengan umur $umur anda $berat, Berat badan ideal anda adalah $bmi")

        }else if(jk=="P"){
            var bmi1 = bb/tb*100
            println("BMI = $bmi1")
            var bmi2 = (tb-100)-(0.15*(tb-100))

            var berat2 :String?
            if(bmi1<18.5){
                berat2 = "Kurus"
            }else if(bmi1>18.5 && bmi1<24.9){
                berat2= "Normal"
            }else if(bmi1>25.9 && bmi1<29){
                berat2 = "Overweight"
            }else{
                berat2 = "Obesitas"
            }
            println(" $nama dengan umur $umur anda $berat2, Berat badan ideal anda adalah $bmi2")
        }






    }

