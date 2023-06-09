package Eksepsi;
public class Bank {
    public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(101);
		System.out.println("Menyimpan Rp 500000");
        System.out.println("anda mempiunyai hutang RP 200000");
		ca.simpanUang(500000);
		
		try {
			System.out.println("\nTarik Uang Rp 100000");
			ca.tarikUang(100000);
            System.out.println("Bayar hutang Rp. 200.000");
            ca.bayarHutang();
			// System.out.println("\nTarik Uang Rp 600000");
			// ca.tarikUang(600000);
		}
		catch (InsufficientFundsException e) {
            System.out.println(
                    "Maaf saldo yang akan Anda ambil kurang Rp " + e.getAmount() + " dari total permintaan Anda");
            e.printStackTrace();
        } catch (LoanFundsException z) {
            System.out.println(
                    "Maaf saldo anda kurang dari biaya yang dibutuhkan untuk membayar hutang sebesar " + z.getAmount());
        }

    }

}
