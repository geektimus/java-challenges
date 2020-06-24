package com.codingmaniacs.others;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CollectionChallengesTests {

    @Test
    public void sortLogListByLogLevelBasic() {
        String[] myLogInfo = {
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector"};

        String[] expected = {
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
        };

        String[] result = CollectionChallenges.sortLogsByLevel(myLogInfo);
        assertArrayEquals("The lists should be the same as we don't consider Level precedence", expected, result);
    }

    @Test
    public void sortLogListByLogLevelMixed() {
        String[] myLogInfo = {
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
                "1592777112 DEBUG com.codingmaniacs.core.Transaction",
                "1592777000 INFO com.codingmaniacs.services.account.PurgeIterator",
                "1592777345 INFO com.codingmaniacs.services.account.PurgeApp"};

        String[] expected = {
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777000 INFO com.codingmaniacs.services.account.PurgeIterator",
                "1592777345 INFO com.codingmaniacs.services.account.PurgeApp",
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777112 DEBUG com.codingmaniacs.core.Transaction"};

        String[] result = CollectionChallenges.sortLogsByLevel(myLogInfo);
        assertArrayEquals("The lists should be the same as we don't consider Level order", expected, result);
    }

    @Test
    public void sortLogListByLogLevelMixedLong() {
        final String[] myLogInfo = {
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
                "1592777112 DEBUG com.codingmaniacs.core.Transaction",
                "1592777000 INFO com.codingmaniacs.services.account.PurgeIterator",
                "1592777345 INFO com.codingmaniacs.services.account.PurgeApp",
                "1592777245 WARNING com.codingmaniacs.core.TransactionManager",
                "1592777350 INFO com.codingmaniacs.core.lab.Factory",
                "1592777880 WARNING com.codingmaniacs.services.account.Iterator",
                "1592777320 INFO com.codingmaniacs.core.TransactionContext",
                "1592777224 DEBUG com.codingmaniacs.core.context.Scheduler",
                "1592777450 DEBUG com.codingmaniacs.services.account.PurgeApp",
                "1592777333 WARNING com.codingmaniacs.core.TransactionManager",
                "1592777665 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777543 WARNING com.codingmaniacs.services.account.Integrator"};
        String[] expected = {
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
                "1592777245 WARNING com.codingmaniacs.core.TransactionManager",
                "1592777880 WARNING com.codingmaniacs.services.account.Iterator",
                "1592777333 WARNING com.codingmaniacs.core.TransactionManager",
                "1592777543 WARNING com.codingmaniacs.services.account.Integrator",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777000 INFO com.codingmaniacs.services.account.PurgeIterator",
                "1592777345 INFO com.codingmaniacs.services.account.PurgeApp",
                "1592777350 INFO com.codingmaniacs.core.lab.Factory",
                "1592777320 INFO com.codingmaniacs.core.TransactionContext",
                "1592777665 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777112 DEBUG com.codingmaniacs.core.Transaction",
                "1592777224 DEBUG com.codingmaniacs.core.context.Scheduler",
                "1592777450 DEBUG com.codingmaniacs.services.account.PurgeApp",
        };


        String[] result = CollectionChallenges.sortLogsByLevel(myLogInfo);
        assertArrayEquals("The lists should be the same as we don't consider Level order", expected, result);
    }

    @Test
    public void sortLogListByLogTsBasic() {
        String[] myLogInfo = {
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector"};

        String[] expected = {
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
        };

        String[] result = CollectionChallenges.sortLogsByTs(myLogInfo);
        assertArrayEquals("The lists should be the same as we don't consider Level precedence", expected, result);
    }

    @Test
    public void sortLogListByLogTsMixed() {
        String[] myLogInfo = {
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
                "1592777112 DEBUG com.codingmaniacs.core.Transaction",
                "1592777000 INFO com.codingmaniacs.services.account.PurgeIterator",
                "1592777345 INFO com.codingmaniacs.services.account.PurgeApp"};

        String[] expected = {
                "1592777000 INFO com.codingmaniacs.services.account.PurgeIterator",
                "1592777112 DEBUG com.codingmaniacs.core.Transaction",
                "1592777345 INFO com.codingmaniacs.services.account.PurgeApp",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
        };

        String[] result = CollectionChallenges.sortLogsByTs(myLogInfo);
        assertArrayEquals("The lists should be the same as we don't consider Level order", expected, result);
    }

    @Test
    public void sortLogListByLogTsMixedLong() {
        final String[] myLogInfo = {
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
                "1592777112 DEBUG com.codingmaniacs.core.Transaction",
                "1592777000 INFO com.codingmaniacs.services.account.PurgeIterator",
                "1592777345 INFO com.codingmaniacs.services.account.PurgeApp",
                "1592777245 WARNING com.codingmaniacs.core.TransactionManager",
                "1592777350 INFO com.codingmaniacs.core.lab.Factory",
                "1592777880 WARNING com.codingmaniacs.services.account.Iterator",
                "1592777320 INFO com.codingmaniacs.core.TransactionContext",
                "1592777224 DEBUG com.codingmaniacs.core.context.Scheduler",
                "1592777450 DEBUG com.codingmaniacs.services.account.PurgeApp",
                "1592777333 WARNING com.codingmaniacs.core.TransactionManager",
                "1592777665 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777543 WARNING com.codingmaniacs.services.account.Integrator"};
        String[] expected = {
                "1592777000 INFO com.codingmaniacs.services.account.PurgeIterator",
                "1592777112 DEBUG com.codingmaniacs.core.Transaction",
                "1592777224 DEBUG com.codingmaniacs.core.context.Scheduler",
                "1592777245 WARNING com.codingmaniacs.core.TransactionManager",
                "1592777320 INFO com.codingmaniacs.core.TransactionContext",
                "1592777333 WARNING com.codingmaniacs.core.TransactionManager",
                "1592777345 INFO com.codingmaniacs.services.account.PurgeApp",
                "1592777350 INFO com.codingmaniacs.core.lab.Factory",
                "1592777450 DEBUG com.codingmaniacs.services.account.PurgeApp",
                "1592777543 WARNING com.codingmaniacs.services.account.Integrator",
                "1592777661 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777662 DEBUG com.codingmaniacs.core.TransactionContext",
                "1592777663 WARNING com.codingmaniacs.core.tc.Connector",
                "1592777665 INFO com.codingmaniacs.services.account.PurgeManager",
                "1592777880 WARNING com.codingmaniacs.services.account.Iterator",
        };


        String[] result = CollectionChallenges.sortLogsByTs(myLogInfo);
        assertArrayEquals("The lists should be the same as we don't consider Level order", expected, result);
    }
}
