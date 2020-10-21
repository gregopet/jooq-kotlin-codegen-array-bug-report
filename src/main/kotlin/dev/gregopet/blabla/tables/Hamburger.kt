/*
 * This file is generated by jOOQ.
 */
package dev.gregopet.blabla.tables


import dev.gregopet.blabla.Public
import dev.gregopet.blabla.tables.records.HamburgerRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row1
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class Hamburger(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, HamburgerRecord>?,
    aliased: Table<HamburgerRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<HamburgerRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.hamburger</code>
         */
        val HAMBURGER = Hamburger()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<HamburgerRecord> = HamburgerRecord::class.java

    /**
     * The column <code>public.hamburger.cheese_width</code>.
     */
    val CHEESE_WIDTH: TableField<HamburgerRecord, Array<java.lang.Integer?>?> = createField(DSL.name("cheese_width"), SQLDataType.INTEGER.getArrayDataType(), this, "")

    private constructor(alias: Name, aliased: Table<HamburgerRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<HamburgerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.hamburger</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.hamburger</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.hamburger</code> table reference
     */
    constructor(): this(DSL.name("hamburger"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, HamburgerRecord>): this(Internal.createPathAlias(child, key), child, key, HAMBURGER, null)
    override fun getSchema(): Schema = Public.PUBLIC
    override fun `as`(alias: String): Hamburger = Hamburger(DSL.name(alias), this)
    override fun `as`(alias: Name): Hamburger = Hamburger(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Hamburger = Hamburger(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Hamburger = Hamburger(name, null)

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row1<Array<java.lang.Integer?>?> = super.fieldsRow() as Row1<Array<java.lang.Integer?>?>
}
