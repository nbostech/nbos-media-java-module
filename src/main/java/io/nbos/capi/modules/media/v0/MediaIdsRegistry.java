package io.nbos.capi.modules.media.v0;

import io.nbos.capi.modules.ids.v0.IDS;

/**
 * Created by vivekkiran on 7/5/16.
 */

public class MediaIdsRegistry {
    static {
        IDS.register("media", MediaApi.class);
    }
}
