package package1;

public class PC {
	CPU cpu;
	HardDisk disk;
	void setCPU(CPU cpu){
		this.cpu=cpu;
	}
	void setHardDisk(HardDisk disk){
		this.disk=disk;	
	}
	void show(){
		System.out.println("CPU速度"+cpu.getSpeed());
		System.out.println("硬盘容量"+disk.getAmount());
		System.out.println("cpu种类"+cpu.gettype());
		System.out.println("硬盘大小"+disk.getcapacity());
	}
 
}