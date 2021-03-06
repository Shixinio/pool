/*
 * This file is generated by jOOQ.
 */
package burst.pool.db;


import burst.pool.db.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>best_submissions</code>.
     */
    public static final BestSubmissions BEST_SUBMISSIONS = burst.pool.db.tables.BestSubmissions.BEST_SUBMISSIONS;

    /**
     * The table <code>flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = burst.pool.db.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>miners</code>.
     */
    public static final Miners MINERS = burst.pool.db.tables.Miners.MINERS;

    /**
     * The table <code>miner_deadlines</code>.
     */
    public static final MinerDeadlines MINER_DEADLINES = burst.pool.db.tables.MinerDeadlines.MINER_DEADLINES;

    /**
     * The table <code>payouts</code>.
     */
    public static final Payouts PAYOUTS = burst.pool.db.tables.Payouts.PAYOUTS;

    /**
     * The table <code>pool_state</code>.
     */
    public static final PoolState POOL_STATE = burst.pool.db.tables.PoolState.POOL_STATE;

    /**
     * The table <code>won_blocks</code>.
     */
    public static final WonBlocks WON_BLOCKS = burst.pool.db.tables.WonBlocks.WON_BLOCKS;
}
