<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ThriftHiveMetastore_alter_dataconnector_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'connector',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\DataConnector',
        ),
    );

    /**
     * @var string
     */
    public $name = null;
    /**
     * @var \metastore\DataConnector
     */
    public $connector = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['name'])) {
                $this->name = $vals['name'];
            }
            if (isset($vals['connector'])) {
                $this->connector = $vals['connector'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_alter_dataconnector_args';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->connector = new \metastore\DataConnector();
                        $xfer += $this->connector->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_alter_dataconnector_args');
        if ($this->name !== null) {
            $xfer += $output->writeFieldBegin('name', TType::STRING, 1);
            $xfer += $output->writeString($this->name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->connector !== null) {
            if (!is_object($this->connector)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('connector', TType::STRUCT, 2);
            $xfer += $this->connector->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
