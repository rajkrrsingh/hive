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

class GetFileMetadataRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'fileIds',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::I64,
            'elem' => array(
                'type' => TType::I64,
                ),
        ),
    );

    /**
     * @var int[]
     */
    public $fileIds = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['fileIds'])) {
                $this->fileIds = $vals['fileIds'];
            }
        }
    }

    public function getName()
    {
        return 'GetFileMetadataRequest';
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
                    if ($ftype == TType::LST) {
                        $this->fileIds = array();
                        $_size791 = 0;
                        $_etype794 = 0;
                        $xfer += $input->readListBegin($_etype794, $_size791);
                        for ($_i795 = 0; $_i795 < $_size791; ++$_i795) {
                            $elem796 = null;
                            $xfer += $input->readI64($elem796);
                            $this->fileIds []= $elem796;
                        }
                        $xfer += $input->readListEnd();
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
        $xfer += $output->writeStructBegin('GetFileMetadataRequest');
        if ($this->fileIds !== null) {
            if (!is_array($this->fileIds)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('fileIds', TType::LST, 1);
            $output->writeListBegin(TType::I64, count($this->fileIds));
            foreach ($this->fileIds as $iter797) {
                $xfer += $output->writeI64($iter797);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
