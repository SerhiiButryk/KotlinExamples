/**
 * Copyright 2022. Happy coding ! :)
 * Author: Serhii Butryk
 */
package design_patterns.bridge.impl

import design_patterns.bridge.impl.storages.ApplicationStorage

abstract class BaseRepository(protected var storageRepoImpl: ApplicationStorage) {

    open fun saveData() {
        storageRepoImpl.store()
    }

}