package ig;

import org.apache.ignite.Ignition;
import org.apache.ignite.cache.eviction.EvictionPolicy;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;

public class RandomEviction {
	public static void main(String[] args) {
		CacheConfiguration cacheCfg = new CacheConfiguration();

		cacheCfg.setName("cacheName");

		// Enabling on-heap caching for this distributed cache.
		cacheCfg.setOnheapCacheEnabled(true);

		// Set the maximum cache size to 1 million (default is 100,000).
		//cacheCfg.setEvictionPolicy(new EvictionPolicy(1000000));

		IgniteConfiguration cfg = new IgniteConfiguration();

		cfg.setCacheConfiguration(cacheCfg);

		// Start Ignite node.
		Ignition.start(cfg);
	}
}
