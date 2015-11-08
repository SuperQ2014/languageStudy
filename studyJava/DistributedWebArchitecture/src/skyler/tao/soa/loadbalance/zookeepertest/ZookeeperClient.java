package skyler.tao.soa.loadbalance.zookeepertest;

import java.io.IOException;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

public class ZookeeperClient {

	public static void main(String[] args) {
		
		String url = "10.77.96.122:8831";
		int sessionTimeOut = 6000;
		ZooKeeper zooKeeper = null;
//		String dataDir = "/data0/chaoqiang/workspace/hadoop/zookeeper-3.4.6/snapshot_dir";
		String dataDir = "/root";
		
		try {
			zooKeeper = new ZooKeeper(url, sessionTimeOut, null);
			System.out.println("Connect to zookeeper success!");
		} catch (IOException e) {
			System.out.println("connect to zookeeper server failed!");
			e.printStackTrace();
		}
		
		try {
			zooKeeper.create(dataDir, "skyler's data".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		} catch (KeeperException | InterruptedException e) {
			System.out.println("create data node failed!");
			e.printStackTrace();
		}
		
		try {
			zooKeeper.setData(dataDir, "new data".getBytes(), -2);
		} catch (KeeperException | InterruptedException e) {
			System.out.println("set root data node some data failed!");
			e.printStackTrace();
		}
		
		Stat stat = new Stat();
		
		byte[] data = null;
		
		try {
			data = zooKeeper.getData(dataDir, false, stat);
		} catch (KeeperException | InterruptedException e) {
			System.out.println("get root node data failed!");
			e.printStackTrace();
		}
		
		System.out.println(data);
		System.out.println(data.length);
	}
}
