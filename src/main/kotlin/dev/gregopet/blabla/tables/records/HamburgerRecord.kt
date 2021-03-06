/*
 * This file is generated by jOOQ.
 */
package dev.gregopet.blabla.tables.records


import dev.gregopet.blabla.tables.Hamburger

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Row1
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class HamburgerRecord() : TableRecordImpl<HamburgerRecord>(Hamburger.HAMBURGER), Record1<Array<java.lang.Integer?>?> {

    var cheeseWidth: Array<java.lang.Integer?>?
        set(value) = set(0, value)
        get() = get(0) as Array<java.lang.Integer?>?

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row1<Array<java.lang.Integer?>?> = super.fieldsRow() as Row1<Array<java.lang.Integer?>?>
    override fun valuesRow(): Row1<Array<java.lang.Integer?>?> = super.valuesRow() as Row1<Array<java.lang.Integer?>?>
    override fun field1(): Field<Array<java.lang.Integer?>?> = Hamburger.HAMBURGER.CHEESE_WIDTH
    override fun component1(): Array<java.lang.Integer?>? = cheeseWidth
    override fun value1(): Array<java.lang.Integer?>? = cheeseWidth

    override fun value1(value: Array<java.lang.Integer?>?): HamburgerRecord {
        cheeseWidth = value
        return this
    }

    override fun values(value1: Array<java.lang.Integer?>?): HamburgerRecord {
        this.value1(value1)
        return this
    }

    /**
     * Create a detached, initialised HamburgerRecord
     */
    constructor(cheeseWidth: Array<java.lang.Integer?>? = null): this() {
        this.cheeseWidth = cheeseWidth
    }
}
